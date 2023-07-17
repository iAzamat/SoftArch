package Homeworks.HW4.Core;

import Homeworks.HW4.ClientApplication.Authentication;
import Homeworks.HW4.Interfaces.ICarrierRepo;
import Homeworks.HW4.Interfaces.ICashRepo;
import Homeworks.HW4.Models.BankAccount;
import Homeworks.HW4.Models.Carrier;
import Homeworks.HW4.Models.Ticket;
import Homeworks.HW4.Models.User;
import Homeworks.HW4.Services.CarrierRepository;
import Homeworks.HW4.Services.CashRepository;

import java.util.Arrays;
import java.util.List;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized = false;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException {
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        }
        return false;
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        List<BankAccount> clients = CashRepository.getCashRepository().getClients();
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getCard() == client.getCardNumber()) {
                isAuthorized = true;
                this.cardNumber = client.getCardNumber();
                System.out.println("Вы авторизованы");
                break;
            }
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public ICashRepo getCashRepository() {
        return cashRepository;
    }

    public void setCashRepository(ICashRepo cashRepository) {
        this.cashRepository = cashRepository;
    }

    public ICarrierRepo getCarrierRepository() {
        return carrierRepository;
    }

    public void setCarrierRepository(ICarrierRepo carrierRepository) {
        this.carrierRepository = carrierRepository;
    }
}
