/**
 * This class is generated by jOOQ
 */
package me.taylorkelly.mywarp.dataconnections.generated;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = { "http://www.jooq.org", "jOOQ version:3.5.1" }, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mywarp extends org.jooq.impl.SchemaImpl {

    private static final long serialVersionUID = 448993621;

    /**
     * The reference instance of <code>mywarp</code>
     */
    public static final Mywarp MYWARP = new Mywarp();

    /**
     * No further instances allowed
     */
    private Mywarp() {
        super("mywarp");
    }

    @Override
    public final java.util.List<org.jooq.Table<?>> getTables() {
        java.util.List result = new java.util.ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final java.util.List<org.jooq.Table<?>> getTables0() {
        return java.util.Arrays.<org.jooq.Table<?>>asList(
                me.taylorkelly.mywarp.dataconnections.generated.tables.Group.GROUP,
                me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER,
                me.taylorkelly.mywarp.dataconnections.generated.tables.Warp.WARP,
                me.taylorkelly.mywarp.dataconnections.generated.tables.WarpGroupMap.WARP_GROUP_MAP,
                me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap.WARP_PLAYER_MAP,
                me.taylorkelly.mywarp.dataconnections.generated.tables.World.WORLD);
    }
}
