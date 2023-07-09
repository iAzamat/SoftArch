package Homeworks.HW1.InMemoryModel;

import Homeworks.HW1.ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    private List<IModelChangedObserver> changeObservers;

    /**
     * конструктор
     *
     * @param changedObservers
     */
    public ModelStore(List<IModelChangedObserver> changedObservers) throws Exception {
        this.changeObservers = changedObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    /**
     * Возвращает сцену по id
     * @param id
     * @return
     */
    public Scene getScena(int id) {
        for (Scene scene : scenes) {
            if (scene.id == id) {
                return scene;
            }
        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
