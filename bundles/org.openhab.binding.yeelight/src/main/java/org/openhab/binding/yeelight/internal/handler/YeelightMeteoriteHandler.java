/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yeelight.internal.handler;

import static org.openhab.binding.yeelight.internal.YeelightBindingConstants.*;

import org.eclipse.smarthome.core.library.types.PercentType;
import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.library.types.HSBType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.types.Command;
import org.openhab.binding.yeelight.internal.YeelightBindingConstants;
import org.openhab.binding.yeelight.internal.lib.device.DeviceStatus;
import org.openhab.binding.yeelight.internal.lib.enums.DeviceAction;
import org.openhab.binding.yeelight.internal.lib.services.DeviceManager;
import org.openhab.binding.yeelight.internal.lib.enums.DeviceMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link YeelightMeteoriteHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Lukas Kugler - Adapted Ceiling Implementation to new Light
 */
public class YeelightMeteoriteHandler extends YeelightHandlerBase {

    private final Logger logger = LoggerFactory.getLogger(YeelightMeteoriteHandler.class);
    
    public YeelightMeteoriteHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        handleCommandHelper(channelUID, command, "Handle Meteorite Command {}");
    }

    @Override
    protected void updateUI(DeviceStatus status) {
        super.updateUI(status);
        if (status.isPowerOff()) {
            updateState(YeelightBindingConstants.CHANNEL_BRIGHTNESS, PercentType.ZERO);
        } else {
            updateState(YeelightBindingConstants.CHANNEL_BRIGHTNESS, new PercentType(status.getBrightness()));
            updateState(YeelightBindingConstants.CHANNEL_COLOR_TEMPERATURE,
                    new PercentType((COLOR_TEMPERATURE_MAXIMUM_METEORITE - status.getCt()) / COLOR_TEMPERATURE_STEP_METEORITE)); //0% of the dimmer must be cold white -> COLOR_TEMPERATURE_MAXIMUM (to match hue and Alexa definitions)
        }
        updateBg_BrightnessAndColorUI(status, COLOR_TEMPERATURE_MAXIMUM_METEORITE, COLOR_TEMPERATURE_STEP_METEORITE);
    }

    @Override
    void handleColorTemperatureCommand(PercentType ct) {
        super.handleColorTemperatureCommand(ct, COLOR_TEMPERATURE_MAXIMUM_METEORITE, COLOR_TEMPERATURE_STEP_METEORITE);
    }
    @Override
    void handleBg_ColorTemperatureCommand(PercentType ct) {
        super.handleBg_ColorTemperatureCommand(ct, COLOR_TEMPERATURE_MAXIMUM_METEORITE, COLOR_TEMPERATURE_STEP_METEORITE);
    }
}
