package com.jerry.mekmm.common.tile.machine;

import mekanism.api.chemical.ChemicalStack;
import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

import net.minecraft.world.item.ItemStack;

@MethodFactory(target = TileEntityAmbientGasCollector.class)
public class TileEntityAmbientGasCollector$ComputerHandler extends ComputerMethodFactory<TileEntityAmbientGasCollector> {

    public TileEntityAmbientGasCollector$ComputerHandler() {
        register(MethodData.builder("getChemical", TileEntityAmbientGasCollector$ComputerHandler::chemicalTank$getChemical).returnType(ChemicalStack.class).methodDescription("Get the contents of the chemical tank."));
        register(MethodData.builder("getChemicalCapacity", TileEntityAmbientGasCollector$ComputerHandler::chemicalTank$getChemicalCapacity).returnType(int.class).methodDescription("Get the capacity of the chemical tank."));
        register(MethodData.builder("getChemicalNeeded", TileEntityAmbientGasCollector$ComputerHandler::chemicalTank$getChemicalNeeded).returnType(int.class).methodDescription("Get the amount needed to fill the chemical tank."));
        register(MethodData.builder("getChemicalFilledPercentage", TileEntityAmbientGasCollector$ComputerHandler::chemicalTank$getChemicalFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the buffer tank."));
        register(MethodData.builder("getChemicalItem", TileEntityAmbientGasCollector$ComputerHandler::inputSlot$getChemicalItem).returnType(ItemStack.class).methodDescription("Get the contents of the input slot."));
        register(MethodData.builder("getEnergyItem", TileEntityAmbientGasCollector$ComputerHandler::energySlot$getEnergyItem).returnType(ItemStack.class).methodDescription("Get the contents of the energy slot."));
    }

    public static Object chemicalTank$getChemical(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getStack(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalCapacity(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getCapacity(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalNeeded(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getNeeded(subject.chemicalTank));
    }

    public static Object chemicalTank$getChemicalFilledPercentage(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerChemicalTankWrapper.getFilledPercentage(subject.chemicalTank));
    }

    public static Object inputSlot$getChemicalItem(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.chemicalSlot));
    }

    public static Object energySlot$getEnergyItem(TileEntityAmbientGasCollector subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(SpecialComputerMethodWrapper.ComputerIInventorySlotWrapper.getStack(subject.energySlot));
    }
}
