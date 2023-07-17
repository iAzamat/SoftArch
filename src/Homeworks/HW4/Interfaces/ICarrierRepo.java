package Homeworks.HW4.Interfaces;

import Homeworks.HW4.Models.Carrier;

/**
 * Интерфейс взаимодействия с базой перевозчиков
 */
public interface ICarrierRepo {
    /**
     * Получить модель перевозчика из базы по ID
     *
     * @param id идентификатор перевозчика в базе
     * @return
     */
    Carrier read(int id);
}
