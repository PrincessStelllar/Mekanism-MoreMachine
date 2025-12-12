package com.jerry.mekmm.common.tile.machine;

import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityRecycler.class)
public class TileEntityRecycler$ComputerHandler extends ComputerMethodFactory<TileEntityRecycler> {

    public TileEntityRecycler$ComputerHandler() {
        register(MethodData.builder("getInput", TileEntityRecycler$ComputerHandler::inputSlot$getInput).returnType(ItemStack.class).methodDescription("Get the contents of the input slot."));
        register(MethodData.builder("getOutput", TileEntityRecycler$ComputerHandler::outputSlot$getOutput).returnType(ItemStack.class).methodDescription("Get the contents of the output slot."));
        register(MethodData.builder("getEnergyItem", TileEntityRecycler$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
        register(MethodData.builder("getEnergyUsage", TileEntityRecycler$ComputerHandler::getEnergyUsage_0).returnType(long.class).methodDescription("Get the energy used in the last tick by the machine"));
    }

    public static Object inputSlot$getInput(TileEntityRecycler subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.inputSlot));
    }

    public static Object outputSlot$getOutput(TileEntityRecycler subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.outputSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityRecycler subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }

    public static Object getEnergyUsage_0(TileEntityRecycler subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getEnergyUsage());
    }
}
