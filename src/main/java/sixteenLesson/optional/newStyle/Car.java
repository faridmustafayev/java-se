package sixteenLesson.optional.newStyle;

import java.util.Optional;

public class Car {

    public Engine engine;
    public String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Optional<Engine> getEngine() {
        return Optional.of(engine);
    }
}
