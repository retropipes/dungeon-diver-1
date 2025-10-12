package studio.ignitionigloogames.dungeondiver1;

import org.retropipes.diane.integration.Integration;

public class DungeonDiver {
    // Constants
    private static HoldingBag bag;
    private static final GameErrorHandler debug = new GameErrorHandler();

    // Methods
    public static HoldingBag getHoldingBag() {
        return DungeonDiver.bag;
    }

    public static void debug(final Throwable t) {
        DungeonDiver.debug.handle(t);
    }

    public static void main(final String[] args) {
        // Install error handler
        Thread.setDefaultUncaughtExceptionHandler(DungeonDiver.debug);
        // Enable OS integration
        Integration.integrate();
        try {
            DungeonDiver.bag = new HoldingBag();
            DungeonDiver.bag.showGUI();
        } catch (final Throwable t) {
            DungeonDiver.debug(t);
        }
    }
}
