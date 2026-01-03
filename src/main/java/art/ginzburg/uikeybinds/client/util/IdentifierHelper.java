package art.ginzburg.uikeybinds.client.util;

import net.minecraft.resources.Identifier;

/**
 * Version-specific helper for creating resource identifiers.
 * This version supports Minecraft 1.21.11+ (uses Identifier).
 */
public class IdentifierHelper {
    /**
     * Parses a string into a resource identifier.
     *
     * @param id The identifier string (e.g., "uikeybinds")
     * @return The resource identifier
     */
    public static Identifier parse(String id) {
        return Identifier.parse(id);
    }
}
