package com.shisheo.net.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.shisheo.net.R
import com.shisheo.net.SharedViewModel
import com.shisheo.net.utils.Helper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.view.*

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var root: View
    private lateinit var viewModel: HomeViewModel
    private lateinit var sharedViewModel: SharedViewModel
    private var errorSnackbar: Snackbar? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        viewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        activity?.let {
            sharedViewModel =
                ViewModelProvider(it).get(SharedViewModel::class.java)
        }
         root = inflater.inflate(R.layout.fragment_home, container, false)
        initViews()
        observers()
        return root
    }

    private fun observers() {
        viewModel.restaurantsResults.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                viewModel.handelResults(it, sharedViewModel)
            }
        })
        viewModel.noResults.observe(viewLifecycleOwner, Observer {
            if (it != null) showError(it) else hideError()
        })
        viewModel.loadingVisibility?.observe(viewLifecycleOwner, Observer {
            root.progressBar.visibility = it
        })

    }

    private fun initViews() {
        root.rv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = viewModel.postAdapter
        }
        Helper.disableEdts(root.search_edit_frame)
    }

    private fun showError(@StringRes errorMessage: Int) {
        root.progressBar.visibility = View.GONE
        root.error_layout.visibility = View.VISIBLE
        errorSnackbar = Snackbar.make(root.main_cont, errorMessage, Snackbar.LENGTH_INDEFINITE)
        errorSnackbar?.setAction(R.string.retry, viewModel.errorClickListener)
        errorSnackbar?.show()
    }

    private fun hideError() {
        root.error_layout.visibility = View.GONE
        errorSnackbar?.dismiss()
    }


}