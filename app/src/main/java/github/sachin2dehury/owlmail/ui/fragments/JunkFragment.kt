package github.sachin2dehury.owlmail.ui.fragments

import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import github.sachin2dehury.owlmail.ui.viewmodels.JunkViewModel

@AndroidEntryPoint
class JunkFragment : MailBoxFragment() {
    override val viewModel: JunkViewModel by activityViewModels()
}