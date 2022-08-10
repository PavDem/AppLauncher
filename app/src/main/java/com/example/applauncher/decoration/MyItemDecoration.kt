package com.example.applauncher.decoration

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.R


class MyItemDecoration(private val context: Context): RecyclerView.ItemDecoration() {

    private val fon : Bitmap = context.resources.getDrawable(R.drawable.ic_launcher_background).toBitmap()


    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        /*parent.children.forEach {
            val offset = it.top / 3
            fon.let { btm ->
                c.drawBitmap(
                    btm,
                    Rect(0, offset, btm.width, it.height + offset),
                    Rect(it.left, it.top, it.right, it.bottom),
                    null
                )
            }
        }*/

    }

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        //outRect.set(0   ,0,0,0)
    }
}