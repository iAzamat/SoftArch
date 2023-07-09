package Homeworks.HW2.RewGenerFabricPattern.Classes.Rewards;

import Homeworks.HW2.RewGenerFabricPattern.Classes.IGameItem;

public class GoldReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
