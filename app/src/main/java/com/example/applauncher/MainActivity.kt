package com.example.applauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.adapter.AppAdapter
import com.example.applauncher.decoration.MyItemDecoration
import com.example.applauncher.model.Item

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = AppAdapter()
        fun getItems(): ArrayList<Item> {
            return arrayListOf(
                App(
                    0,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Apple",
                    R.drawable.baseline_assignment_returned_black_24dp
                ), App(
                    1,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Banana",
                    R.drawable.baseline_assignment_returned_black_24dp,
                ),
                App(
                    2,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Lemon",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    3,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    4,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Strawberry",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    5,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    6,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    7,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    8,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ), App(
                    9,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ),
                App(
                    10,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                ), App(
                    11,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    R.drawable.baseline_assignment_returned_black_24dp
                )
            )
        }

        adapter.items = getItems()
        recyclerView.adapter = adapter

        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        val myItemDecoration = MyItemDecoration(this);
        recyclerView.addItemDecoration(myItemDecoration)
    }
}