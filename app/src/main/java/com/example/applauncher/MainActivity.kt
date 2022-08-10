package com.example.applauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.adapter.AppListRecyclerAdapter
import com.example.applauncher.decoration.MyItemDecoration
import com.example.applauncher.model.Item

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = AppListRecyclerAdapter()
        fun getItems(): ArrayList<Item> {
            return arrayListOf(
                App(
                    0,
                    R.drawable.opera_icon,
                    "Apple",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    1,
                    R.drawable.opera_icon,
                    "Banana",
                    R.drawable.baseline_assignment_returned_black_24dp,
                ),
                App(
                    2,
                    R.drawable.opera_icon,
                    "Lemon",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    3,
                    R.drawable.opera_icon,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    4,
                    R.drawable.opera_icon,
                    "Strawberry",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    5,
                    R.drawable.opera_icon,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    6,
                    R.drawable.opera_icon,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    7,
                    R.drawable.opera_icon,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    8,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    9,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    10,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    12,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    13,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    14,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    15,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    16,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    17,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    18,
                    R.drawable.opera_icon,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                )
            )
        }

        adapter.b = getItems()
        recyclerView.adapter = adapter

        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        val myItemDecoration = MyItemDecoration(this);
        recyclerView.addItemDecoration(myItemDecoration)
    }
}