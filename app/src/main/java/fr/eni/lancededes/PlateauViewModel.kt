package fr.eni.lancededes

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlateauViewModel: ViewModel() {
    var compteur = MutableLiveData<Int>()
    var compteurGauche = 0
    var compteurDroite = 0
    var totalGauche = 0
    var totalDroite = 0
    var image = 0

    init {
        compteur.value = 0
        image = R.drawable.valeur_une
    }

    fun ajouterTotalGauche(view:View)
    {
        val valeur = (1..6).random()

        image = when(valeur)
        {
            1-> R.drawable.valeur_une
            2-> R.drawable.valeur_deux
            3-> R.drawable.valeur_trois
            4-> R.drawable.valeur_quatre
            5-> R.drawable.valeur_cinq
            6-> R.drawable.valeur_six
            else -> R.drawable.valeur_une
        }


        totalGauche += valeur
        compteur.value = (compteur.value)?.plus(1)
        compteurGauche++
    }

    fun ajouterTotalDroite(view:View)
    {
        val valeur = (1..6).random()

        image = when(valeur)
        {
            1-> R.drawable.valeur_une
            2-> R.drawable.valeur_deux
            3-> R.drawable.valeur_trois
            4-> R.drawable.valeur_quatre
            5-> R.drawable.valeur_cinq
            6-> R.drawable.valeur_six
            else -> R.drawable.valeur_une
        }

        totalDroite += valeur
        compteur.value = (compteur.value)?.plus(1)
        compteurDroite++

    }
}