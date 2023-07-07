package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private List<IModelChangedObserver> changeObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        this.changeObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    public Scene getScena(int scena) {
        return getScena(scena);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }

    public List<IModelChangedObserver> getChangeObservers() {
        return changeObservers;
    }

    public void setChangeObservers(List<IModelChangedObserver> changeObservers) {
        this.changeObservers = changeObservers;
    }
}
