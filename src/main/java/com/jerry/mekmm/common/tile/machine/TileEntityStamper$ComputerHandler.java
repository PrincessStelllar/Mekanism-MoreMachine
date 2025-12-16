package com.jerry.mekmm.common.tile.machine;

import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityStamper.class)
public class TileEntityStamper$ComputerHandler extends ComputerMethodFactory<TileEntityStamper> {

    public TileEntityStamper$ComputerHandler() {
        register(MethodData.builder("getItemInput", TileEntityStamper$ComputerHandler::itemInputSlot$getItemInput).returnType(ItemStack.class).methodDescription("Get the contents of the item input slot."));
        register(MethodData.builder("getMoldInput", TileEntityStamper$ComputerHandler::moldInputSlot$getMoldInput).returnType(ItemStack.class).methodDescription("Get the contents of the mold input slot."));
        register(MethodData.builder("getOutput", TileEntityStamper$ComputerHandler::outputSlot$getOutput).returnType(ItemStack.class).methodDescription("Get the contents of the output slot."));
        register(MethodData.builder("getEnergyItem", TileEntityStamper$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
        register(MethodData.builder("getEnergyUsage", TileEntityStamper$ComputerHandler::getEnergyUsage_0).returnType(long.class).methodDescription("Get the energy used in the last tick by the machine"));
    }

    public static Object itemInputSlot$getItemInput(TileEntityStamper subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.itemInputSlot));
    }

    public static Object moldInputSlot$getMoldInput(TileEntityStamper subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.moldInputSlot));
    }

    public static Object outputSlot$getOutput(TileEntityStamper subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.outputSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityStamper subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }

    public static Object getEnergyUsage_0(TileEntityStamper subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getEnergyUsage());
    }
}
