
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;


public final class DetectEncoding extends AbstractBean {
    public DetectEncoding(ByteBuf _buf) { 
        id = _buf.readInt();
        name = _buf.readString();
    }

    public static DetectEncoding deserialize(ByteBuf _buf) {
            return new cfg.test.DetectEncoding(_buf);
    }

    public final int id;
    public final String name;

    public static final int __ID__ = -1154609646;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "(format_field_name __code_style field.name):" + id + ","
        + "(format_field_name __code_style field.name):" + name + ","
        + "}";
    }
}
