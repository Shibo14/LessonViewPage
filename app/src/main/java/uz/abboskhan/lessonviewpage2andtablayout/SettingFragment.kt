package uz.abboskhan.lessonviewpage2andtablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.abboskhan.lessonviewpage2andtablayout.R


class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }
}