package no03.after;

public class Runtime {
    private static final Runtime currentRuntime = new Runtime();

    private static Runtime.Version version;

    public static Runtime getRuntime() {
        return currentRuntime;
    }

    private Runtime() {}

    public static Runtime.Version version() {
        if (version == null) {
            version = new Runtime.Version();
        }
        return version;
    }

    public static final class Version
    {
        private final String version;

        private Version()
        {
            this.version = "11.01";
        }

    }
}

