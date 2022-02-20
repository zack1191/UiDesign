package com.hha.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hha.uidesign.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class MainActivity : AppCompatActivity()
{

    private lateinit var binding : ActivityMainBinding

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

    }
}