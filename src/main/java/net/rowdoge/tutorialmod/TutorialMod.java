package net.rowdoge.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.rowdoge.tutorialmod.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// important comment right here
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}