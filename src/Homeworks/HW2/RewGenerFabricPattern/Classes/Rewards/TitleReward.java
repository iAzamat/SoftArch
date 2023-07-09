package Homeworks.HW2.RewGenerFabricPattern.Classes.Rewards;

import Homeworks.HW2.RewGenerFabricPattern.Classes.IGameItem;

public class TitleReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Title");
    }
}
