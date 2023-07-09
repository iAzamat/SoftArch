package Homeworks.HW2.RewGenerFabricPattern.Classes.Generators;

import Homeworks.HW2.RewGenerFabricPattern.Classes.IGameItem;
import Homeworks.HW2.RewGenerFabricPattern.Classes.ItemFabric;
import Homeworks.HW2.RewGenerFabricPattern.Classes.Rewards.GemReward;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
