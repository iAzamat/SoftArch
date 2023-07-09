package Homeworks.HW2.RewGenerFabricPattern.Classes.Generators;

import Homeworks.HW2.RewGenerFabricPattern.Classes.IGameItem;
import Homeworks.HW2.RewGenerFabricPattern.Classes.ItemFabric;
import Homeworks.HW2.RewGenerFabricPattern.Classes.Rewards.ArtifactReward;

public class ArtifactGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new ArtifactReward();
    }
}
