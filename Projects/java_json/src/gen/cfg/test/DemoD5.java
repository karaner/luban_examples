
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public final class DemoD5 extends cfg.test.DemoDynamic {
    public DemoD5(JsonObject _buf) { 
        super(_buf);
        time = cfg.test.DateTimeRange.deserialize(_buf.get("time").getAsJsonObject());
    }

    public static DemoD5 deserialize(JsonObject _buf) {
            return new cfg.test.DemoD5(_buf);
    }

    public final cfg.test.DateTimeRange time;

    public static final int __ID__ = -2138341744;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "(format_field_name __code_style field.name):" + x1 + ","
        + "(format_field_name __code_style field.name):" + time + ","
        + "}";
    }
}
