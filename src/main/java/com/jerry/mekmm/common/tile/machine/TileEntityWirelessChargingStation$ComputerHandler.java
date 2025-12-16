package com.jerry.mekmm.common.tile.machine;

import com.jerry.mekmm.common.integration.computer.ComputerEnergyContainerWrapper;

import mekanism.common.integration.computer.*;
import mekanism.common.integration.computer.annotation.MethodFactory;

@MethodFactory(target = TileEntityWirelessChargingStation.class)
public class TileEntityWirelessChargingStation$ComputerHandler extends ComputerMethodFactory<TileEntityWirelessChargingStation> {

    private final String[] NAMES_equip = new String[] { "equip" };

    private final String[] NAMES_inventory = new String[] { "inventory" };

    private final String[] NAMES_curios = new String[] { "curios" };

    private final Class[] TYPES_boolean = new Class[] { boolean.class };

    public TileEntityWirelessChargingStation$ComputerHandler() {
        register(MethodData.builder("getEnergy", TileEntityWirelessChargingStation$ComputerHandler::energyContainer$getEnergy).returnType(long.class).methodDescription("Get the stored of the energy container."));
        register(MethodData.builder("getEnergyCapacity", TileEntityWirelessChargingStation$ComputerHandler::energyContainer$getEnergyCapacity).returnType(long.class).methodDescription("Get the capacity of the energy container."));
        register(MethodData.builder("getEnergyNeeded", TileEntityWirelessChargingStation$ComputerHandler::energyContainer$getEnergyNeeded).returnType(long.class).methodDescription("Get the amount needed to fill the energy container."));
        register(MethodData.builder("getEnergyFilledPercentage", TileEntityWirelessChargingStation$ComputerHandler::energyContainer$getEnergyFilledPercentage).returnType(double.class).methodDescription("Get the filled percentage of the energy container."));
        register(MethodData.builder("setChargeEquipment", TileEntityWirelessChargingStation$ComputerHandler::setChargeEquipment).requiresPublicSecurity().arguments(NAMES_equip, TYPES_boolean));
        register(MethodData.builder("setChargeInventory", TileEntityWirelessChargingStation$ComputerHandler::setChargeInventory).requiresPublicSecurity().arguments(NAMES_inventory, TYPES_boolean));
        register(MethodData.builder("setChargeCurios", TileEntityWirelessChargingStation$ComputerHandler::setChargeCurios).requiresPublicSecurity().arguments(NAMES_curios, TYPES_boolean));
    }

    public static Object energyContainer$getEnergy(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerEnergyContainerWrapper.getEnergy(subject.energyContainer));
    }

    public static Object energyContainer$getEnergyCapacity(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerEnergyContainerWrapper.getCapacity(subject.energyContainer));
    }

    public static Object energyContainer$getEnergyNeeded(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerEnergyContainerWrapper.getNeeded(subject.energyContainer));
    }

    public static Object energyContainer$getEnergyFilledPercentage(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        return helper.convert(ComputerEnergyContainerWrapper.getFilledPercentage(subject.energyContainer));
    }

    public static Object setChargeEquipment(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        subject.setChargeEquipment(helper.getBoolean(0));
        return helper.voidResult();
    }

    public static Object setChargeInventory(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        subject.setChargeInventory(helper.getBoolean(0));
        return helper.voidResult();
    }

    public static Object setChargeCurios(TileEntityWirelessChargingStation subject, BaseComputerHelper helper) throws ComputerException {
        subject.setChargeCurios(helper.getBoolean(0));
        return helper.voidResult();
    }
}
