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
                    "Juicy Apple fruit, which is eaten fresh, serves as a raw material in cooking and for making drinks."
                ), App(
                    1,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Banana",
                    "It is one of the oldest food crops, and for tropical countries it is the most important food plant and the main export item."
                ),
                App(
                    2,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Lemon",
                    "Lemons are eaten fresh, and are also used in the manufacture of confectionery and soft drinks, in the liquor and perfume industry."
                ),
                App(
                    3,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                App(
                    4,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Strawberry",
                    "A perennial herbaceous plant 5-20 cm high, with a thick brown rhizome. \"Mustache\" is short. The stem is thin."
                ),
                App(
                    5,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                App(
                    6,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                App(
                    7,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                App(
                    8,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ), App(
                    9,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ),
                App(
                    10,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                ), App(
                    11,
                    R.drawable.baseline_assignment_returned_black_24dp,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
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