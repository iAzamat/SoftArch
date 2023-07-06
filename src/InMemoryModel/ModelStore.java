package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private IModelChangedObserver changedObserver;

    public Scene getScena(int scena) {
        return getScena(scena);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
