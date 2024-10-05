package dev.axel.pc1_p2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.axel.fragments.ui.model.SongModel
import dev.axel.pc1_p2.R
import dev.axel.pc1_p2.adapter.SongAdapter

class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(getSongs())

        return view
    }

    private fun getSongs(): List<SongModel> {
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(SongModel(1, R.drawable.cristiano, "Cristiano", "2000", "21", ""))
        lstSong.add(SongModel(2, R.drawable.messi, "Messi", "2001", "22", ""))
        lstSong.add(SongModel(3, R.drawable.neymar, "Neymar", "2002", "23", ""))
        lstSong.add(SongModel(4, R.drawable.salah, "Salah", "2003", "24", ""))
        lstSong.add(SongModel(5, R.drawable.vinicius, "Vinicius", "2004", "25", ""))

        return lstSong
    }
}