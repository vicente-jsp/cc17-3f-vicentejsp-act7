package com.example.baguioexplorer_mycityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.baguioexplorer_mycityapp.PlaceViewModel
import com.example.baguioexplorer_mycityapp.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PlaceViewModel by viewModels()  // Use by viewModels() to properly initialize ViewModel
    private lateinit var adapter: PlaceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve the category argument passed from the previous screen
        val category = arguments?.getString("category") ?: return
        viewModel.loadPlaces(category)  // Load places based on the selected category

        // Initialize RecyclerView and Adapter
        adapter = PlaceAdapter { place -> navigateToRecommendation(place) }
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        // Observe places LiveData from ViewModel and update RecyclerView
        viewModel.places.observe(viewLifecycleOwner) { places ->
            adapter.setPlaces(places)
        }
    }

    private fun navigateToRecommendation(place: Place) {
        // Navigate to RecommendationFragment with complete place data
        val action = CategoryFragmentDirections.actionCategoryFragmentToRecommendationFragment(
            placeName = place.name,
            imageResId = place.imageResId,
            description = place.description
        )
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}