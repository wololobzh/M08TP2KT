package fr.eni.lancededes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.eni.lancededes.databinding.FragmentPlateauBinding


class PlateauFragment : Fragment() {

    private lateinit var viewModel: PlateauViewModel
    private lateinit var binding: FragmentPlateauBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentPlateauBinding>(inflater,
            R.layout.fragment_plateau, container, false)

        viewModel = ViewModelProvider(this).get(PlateauViewModel::class.java)

        viewModel.compteur.observe(viewLifecycleOwner, Observer { valeur ->
            binding.vm = viewModel
        })

        return binding.root
    }
}