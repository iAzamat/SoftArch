package Homeworks.HW2.RewGenerFabricPattern;

import Homeworks.HW2.RewGenerFabricPattern.Classes.Generators.*;
import Homeworks.HW2.RewGenerFabricPattern.Classes.ItemFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new ArtifactGenerator());
        fabricList.add(new CombatMountsGenerator());
        fabricList.add(new DiamondGenerator());
        fabricList.add(new ExpBoostGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new GoldGenerator());
        fabricList.add(new TitleGenerator());

        int rewardsValue = 20;

        for (int i = 0; i < rewardsValue; i++) {
            int index = random.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
