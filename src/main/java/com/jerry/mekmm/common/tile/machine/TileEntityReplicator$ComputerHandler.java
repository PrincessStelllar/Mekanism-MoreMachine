package com.jerry.mekmm.common.tile.machine;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityReplicator.class)
public class TileEntityReplicator$ComputerHandler extends ComputerMethodFactory<TileEntityReplicator> {

    public TileEntityReplicator$ComputerHandler() {
        register(MethodData.builder("getChemical", TileEntityReplicator$ComputerHandler::chemicalTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the chemical tank."));
        register(MethodData.builder("getChemicalCapacity", TileEntityReplicator$ComputerHandler::chemicalTank$getChemicalCapacity).returnType(long.class).methodDescription("Get the capacity of the chemical tank."));
        register(MethodData.builder("getChemicalNeeded", TileEntityReplicator$ComputerHandler::chemicalTank$getChemicalNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the chemical tank."));
        register(MethodData.builder("getChemicalFilledPercentage", TileEntityReplicator$ComputerHandler::chemicalTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the chemical tank."));
        register(MethodData.builder("getInput", TileEntityReplicator$ComputerHandler::inputSlot$getInput).returnType(ItemStack.class).methodDescription("Get the contents of the input slot."));
        register(MethodData.builder("getOutput", TileEntityReplicator$ComputerHandler::outputSlot$getOutput).returnType(ItemStack.class).methodDescription("Get the contents of the output slot."));
        register(MethodData.builder("getChemicalItem", TileEntityReplicator$ComputerHandler::chemicalSlot$getChemicalItem).returnType(ItemStack.class).methodDescription("Get the contents of the chemical input slot."));
        register(MethodData.builder("getEnergyItem", TileEntityReplicator$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
        register(MethodData.builder("getEnergyUsage", TileEntityReplicator$ComputerHandler::getEnergyUsage_0).returnType(long.class).methodDescription("Get the energy used in the last tick by the machine"));
    }

    public static Object chemicalTank$getChemical(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalCapacity(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalNeeded(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalFilledPercentage(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.chemicalTank));
    }

    public static Object inputSlot$getInput(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.inputSlot));
    }

    public static Object outputSlot$getOutput(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.outputSlot));
    }

    public static Object chemicalSlot$getChemicalItem(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.chemicalSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }

    public static Object getEnergyUsage_0(TileEntityReplicator subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(subject.getEnergyUsage());
    }
}
