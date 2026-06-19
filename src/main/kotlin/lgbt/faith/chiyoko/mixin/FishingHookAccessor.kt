package lgbt.faith.chiyoko.mixin

import net.minecraft.world.entity.projectile.FishingHook
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.gen.Accessor

@Mixin(FishingHook::class)
interface FishingHookAccessor {
    @Accessor("openWater")
    fun isOpenWater(): Boolean

    @Accessor("biting")
    fun biting(): Boolean


}