package com.ovologos.passwordmanager.mock

import com.ovologos.passwordmanager.R


object Data {

    fun getData(): List<DataModel> {

        val dataList: ArrayList<DataModel> = arrayListOf()

        val facebook = DataModel(

            icon = R.drawable.ic_baseline_add_24,
            "facebook",
            "lalalal@hotmail.com",
            "sada23131"
        )

        val google = DataModel(
            icon = R.drawable.ic_baseline_add_24,
            "google",
            "google@google.com",
            "google"
        )

        val twitter = DataModel(
            icon = R.drawable.ic_baseline_add_24,
            "twitter",
            "twitter@twitter.com",
            "twitter"
        )

        val instagram = DataModel(
            icon = R.drawable.ic_baseline_add_24,
            "instagram",
            "instagram@instagram.com",
            "instagram"
        )

        dataList.add(facebook)
        dataList.add(google)
        dataList.add(twitter)
        dataList.add(instagram)


        return dataList
    }
}