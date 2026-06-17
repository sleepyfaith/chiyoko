package lgbt.faith.chiyoko.mixin

import com.llamalad7.mixinextras.sugar.Local
import lgbt.faith.chiyoko.gui.ChiyokoRenderer
import net.minecraft.client.DeltaTracker
import net.minecraft.client.gui.Gui
import net.minecraft.client.gui.GuiGraphicsExtractor
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Gui::class)
class GuiMixin {
    @Inject(
        method = ["extractRenderState"],
        at = [At("TAIL")]
    )
    private fun dropseed(
        deltaTracker: DeltaTracker,
        shouldRenderLevel: Boolean,
        resourcesLoaded: Boolean,
        ci: CallbackInfo,
        @Local graphics: GuiGraphicsExtractor
    ) {
        ChiyokoRenderer().render(graphics)
    }
}