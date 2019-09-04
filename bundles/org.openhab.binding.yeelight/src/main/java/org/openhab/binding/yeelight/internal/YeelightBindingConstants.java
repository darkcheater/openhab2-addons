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
package org.openhab.binding.yeelight.internal;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link YeelightBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Coaster Li - Initial contribution
 * @author Joe Ho - Added Duration / Added command channel
 */
public class YeelightBindingConstants {

    public static final String BINDING_ID = "yeelight";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_CEILING = new ThingTypeUID(BINDING_ID, "ceiling");
    public static final ThingTypeUID THING_TYPE_CEILING1 = new ThingTypeUID(BINDING_ID, "ceiling1");
    public static final ThingTypeUID THING_TYPE_CEILING3 = new ThingTypeUID(BINDING_ID, "ceiling3");
    public static final ThingTypeUID THING_TYPE_CEILING10 = new ThingTypeUID(BINDING_ID, "ceiling10");
    public static final ThingTypeUID THING_TYPE_DOLPHIN = new ThingTypeUID(BINDING_ID, "dolphin");
    public static final ThingTypeUID THING_TYPE_CTBULB = new ThingTypeUID(BINDING_ID, "ct_bulb");
    public static final ThingTypeUID THING_TYPE_WONDER = new ThingTypeUID(BINDING_ID, "wonder");
    public static final ThingTypeUID THING_TYPE_STRIPE = new ThingTypeUID(BINDING_ID, "stripe");
    public static final ThingTypeUID THING_TYPE_DESKLAMP = new ThingTypeUID(BINDING_ID, "desklamp");



    // List of thing Parameters names
    public static final String PARAMETER_DEVICE_ID = "deviceId";
    public static final String PARAMETER_DURATION = "duration";

    // List of all Channel ids
    public static final String CHANNEL_BRIGHTNESS = "brightness";
    public static final String CHANNEL_COLOR = "color";
    public static final String CHANNEL_COLOR_TEMPERATURE = "colorTemperature";
    public static final String CHANNEL_BG_BRIGHTNESS = "bg_brightness";
    public static final String CHANNEL_BG_COLOR = "bg_color";
    public static final String CHANNEL_BG_COLOR_TEMPERATURE = "bg_colorTemperature";
    public static final String CHANNEL_COMMAND = "command";

    // Constants used
    public static final int COLOR_TEMPERATURE_MINIMUM = 2700;
    public static final int COLOR_TEMPERATURE_MAXIMUM = 6500;
    public static final int COLOR_TEMPERATURE_STEP = (COLOR_TEMPERATURE_MAXIMUM-COLOR_TEMPERATURE_MINIMUM)/100; //38
    
    public static final int COLOR_TEMPERATURE_MINIMUM_CEILING = 2700;
    public static final int COLOR_TEMPERATURE_MAXIMUM_CEILING = 6500;
    public static final int COLOR_TEMPERATURE_STEP_CEILING = (COLOR_TEMPERATURE_MAXIMUM_CEILING-COLOR_TEMPERATURE_MINIMUM_CEILING)/100; //38
    
    public static final int COLOR_TEMPERATURE_MINIMUM_COLOR = 1700;
    public static final int COLOR_TEMPERATURE_MAXIMUM_COLOR = 6500;
    public static final int COLOR_TEMPERATURE_STEP_COLOR = (COLOR_TEMPERATURE_MAXIMUM-COLOR_TEMPERATURE_MINIMUM)/100; //48
    
    public static final int COLOR_TEMPERATURE_MINIMUM_METEORITE = 2700;
    public static final int COLOR_TEMPERATURE_MAXIMUM_METEORITE = 6500;
    public static final int COLOR_TEMPERATURE_STEP_METEORITE = (COLOR_TEMPERATURE_MAXIMUM_METEORITE-COLOR_TEMPERATURE_MINIMUM_METEORITE)/100; //38
}
