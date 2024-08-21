package com.example.onesessionscreen.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.onesessionscreen.R
import com.example.onesessionscreen.components.PrimaryButton
import com.example.onesessionscreen.components.ProfileLayout
import com.example.onesessionscreen.components.SessionContext
import com.example.onesessionscreen.components.TopicText

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OneOneSessionsScreen() {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = stringResource(R.string.pending),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.back_arrow)
                    )
                },

            )
        }

    ) {
        Column(
            modifier = Modifier
                .padding(15.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(50.dp))

            TopicText(
                text1 = stringResource(R.string.being_the_only_designer),
                text2 = stringResource(R.string.sat_mar_10),
                text3 = stringResource(R.string._6_00pm_6_30pm)
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileLayout(
                title1 = stringResource(R.string.cecilia_ouko),
                title2 = stringResource(R.string.lead_ux_designer_google)
            )

            Divider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 1.dp)

            Spacer(modifier = Modifier.height(15.dp))

            SessionContext(
                text1 = stringResource(R.string.session_type),
                text2 = stringResource(R.string.one_on_one)
            )

            Spacer(modifier = Modifier.height(10.dp))

            SessionContext(
                text1 = stringResource(R.string.topic),
                text2 = stringResource(R.string.being_the_only_designer) )

            Spacer(modifier = Modifier.height(10.dp))

            SessionContext(
                text1 = stringResource(R.string.notes),
                text2 = stringResource(R.string.please_review_my_prototype)
            )

            Spacer(modifier = Modifier.height(10.dp))

            SessionContext(
                text1 = stringResource(R.string.meeting_link),
                text2 = stringResource(R.string.https_meet_google_com_bam_ife_mic)
            )

            Spacer(modifier = Modifier.height(100.dp))

            PrimaryButton(title = stringResource(R.string.reschedule)) {

            }

        }

    }
}