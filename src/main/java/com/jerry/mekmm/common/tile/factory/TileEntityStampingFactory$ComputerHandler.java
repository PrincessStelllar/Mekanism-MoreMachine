package com.jerry.mekmm.common.tile.factory;

import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityStampingFactory.class)
public class TileEntityStampingFactory$ComputerHandler extends ComputerMethodFactory<TileEntityStampingFactory> {

    public TileEntityStampingFactory$ComputerHandler() {
        register(MethodData.builder("getMoldInput", TileEntityStampingFactory$ComputerHandler::moldSlot$getMoldInput).returnType(ItemStack.class).methodDescription("Get the contents of the mold input slot."));
    }

    public static Object moldSlot$getMoldInput(TileEntityStampingFactory subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.extraSlot));
    }
}
