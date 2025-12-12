package com.jerry.mekmm.common.tile.machine;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityChemicalReplicator.class)
public class TileEntityChemicalReplicator$ComputerHandler extends ComputerMethodFactory<TileEntityChemicalReplicator> {

    public TileEntityChemicalReplicator$ComputerHandler() {
        register(MethodData.builder("getInput", TileEntityChemicalReplicator$ComputerHandler::inputTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the input tank."));
        register(MethodData.builder("getInputCapacity", TileEntityChemicalReplicator$ComputerHandler::inputTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the input tank."));
        register(MethodData.builder("getInputNeeded", TileEntityChemicalReplicator$ComputerHandler::inputTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the input tank."));
        register(MethodData.builder("getInputFilledPercentage", TileEntityChemicalReplicator$ComputerHandler::inputTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the input tank."));
        register(MethodData.builder("getOutput", TileEntityChemicalReplicator$ComputerHandler::outputTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the output tank."));
        register(MethodData.builder("getOutputCapacity", TileEntityChemicalReplicator$ComputerHandler::outputTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the output tank."));
        register(MethodData.builder("getOutputNeeded", TileEntityChemicalReplicator$ComputerHandler::outputTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the output tank."));
        register(MethodData.builder("getOutputFilledPercentage", TileEntityChemicalReplicator$ComputerHandler::outputTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the output tank."));
        register(MethodData.builder("getUU", TileEntityChemicalReplicator$ComputerHandler::uuTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the uu tank."));
        register(MethodData.builder("getUUCapacity", TileEntityChemicalReplicator$ComputerHandler::uuTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the uu tank."));
        register(MethodData.builder("getUUNeeded", TileEntityChemicalReplicator$ComputerHandler::uuTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the uu tank."));
        register(MethodData.builder("getUUFilledPercentage", TileEntityChemicalReplicator$ComputerHandler::uuTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the uu tank."));
        register(MethodData.builder("getUUSlot", TileEntityChemicalReplicator$ComputerHandler::uuSlot$getUUSlot).returnType(ItemStack.class).methodDescription("Get the contents of the uu slot."));
        register(MethodData.builder("getInputSlot", TileEntityChemicalReplicator$ComputerHandler::inputSlot$getInputSlot).returnType(ItemStack.class).methodDescription("Get the contents of the input slot."));
        register(MethodData.builder("getOutputSlot", TileEntityChemicalReplicator$ComputerHandler::outputSlot$getOutputSlot).returnType(ItemStack.class).methodDescription("Get the contents of the output slot."));
        register(MethodData.builder("getEnergyItem", TileEntityChemicalReplicator$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
        register(MethodData.builder("getEnergyUsage", TileEntityChemicalReplicator$ComputerHandler::getEnergyUsage_0).returnType(long.class).methodDescription("Get the energy used in the last tick by the machine"));
    }

    public static Object inputTank$getChemical(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.inputTank));
    }

    public static Object inputTank$getChemicalCapacity(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.inputTank));
    }

    public static Object inputTank$getChemicalNeeded(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.inputTank));
    }

    public static Object inputTank$getChemicalFilledPercentage(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.inputTank));
    }

    public static Object outputTank$getChemical(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.outputTank));
    }

    public static Object outputTank$getChemicalCapacity(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.outputTank));
    }

    public static Object outputTank$getChemicalNeeded(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.outputTank));
    }

    public static Object outputTank$getChemicalFilledPercentage(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.outputTank));
    }

    public static Object uuTank$getChemical(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.uuTank));
    }

    public static Object uuTank$getChemicalCapacity(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.uuTank));
    }

    public static Object uuTank$getChemicalNeeded(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.uuTank));
    }

    public static Object uuTank$getChemicalFilledPercentage(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.uuTank));
    }

    public static Object uuSlot$getUUSlot(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.uuSlot));
    }

    public static Object inputSlot$getInputSlot(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.inputSlot));
    }

    public static Object outputSlot$getOutputSlot(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.outputSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }

    public static Object getEnergyUsage_0(TileEntityChemicalReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getEnergyUsage());
    }
}
