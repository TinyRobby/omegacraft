
package net.mcreator.omegacraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.omegacraft.OmegacraftModElements;

@OmegacraftModElements.ModElement.Tag
public class IceSwordItem extends OmegacraftModElements.ModElement {
	@ObjectHolder("omegacraft:ice_sword")
	public static final Item block = null;
	public IceSwordItem(OmegacraftModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 164;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5.8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.PACKED_ICE, (int) (1)));
			}
		}, 3, -2.5999999999999999f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("ice_sword"));
	}
}
