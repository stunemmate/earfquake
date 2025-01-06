package com.github.stunemmate.earfquake.item.weapon;

import net.minecraft.world.item.Item;

public abstract class Weapon extends Item {

    public Weapon() {
        super(getDefaultWeaponProperties());
    }

    public Weapon(Properties props) {
        super(props);
    }

    private static Properties getDefaultWeaponProperties() {
        return new Item.Properties().stacksTo(1);
    }
}
