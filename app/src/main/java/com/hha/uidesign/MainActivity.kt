package com.hha.uidesign

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import com.hha.uidesign.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class MainActivity : AppCompatActivity()
{

    private lateinit var binding : ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<CarouselItem>()

        list.add(
            CarouselItem(
                imageUrl = "https://images.unsplash.com/photo-1532581291347-9c39cf10a73c?w=1080",
                caption = "Photo by Aaron Wu on Unsplash"
                        )
                )
        list.add(
            CarouselItem(
                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080",
                caption = "Photo by Johannes Plenio on Unsplash"
                        )
                )
        // ...

        binding.imageCarousel.addData(list)

        binding.apply {
            btnByRoom.setOnClickListener {
                byRatesLayout.visibility = View.GONE
                byRoomLayout.visibility = View.VISIBLE
                btnByRoom.setBackgroundColor(getColor(R.color.darkgrey))
                btnByRates.setBackgroundColor(getColor(R.color.white))
            }

            btnByRates.setOnClickListener {
                byRatesLayout.visibility = View.VISIBLE
                byRoomLayout.visibility = View.GONE
                btnByRoom.setBackgroundColor(getColor(R.color.white))
                btnByRates.setBackgroundColor(getColor(R.color.darkgrey))
            }
        }

    }
}