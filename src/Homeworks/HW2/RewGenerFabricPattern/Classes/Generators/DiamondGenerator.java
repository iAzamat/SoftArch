package Homeworks.HW2.RewGenerFabricPattern.Classes.Generators;

import Homeworks.HW2.RewGenerFabricPattern.Classes.IGameItem;
import Homeworks.HW2.RewGenerFabricPattern.Classes.ItemFabric;
import Homeworks.HW2.RewGenerFabricPattern.Classes.Rewards.DiamondReward;

public class DiamondGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new DiamondReward();
    }
}
