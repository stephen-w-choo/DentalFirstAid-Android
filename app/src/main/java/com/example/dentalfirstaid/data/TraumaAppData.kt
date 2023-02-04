package com.example.dentalfirstaid.data

import androidx.compose.ui.res.stringResource
import com.example.dentalfirstaid.R
import com.example.dentalfirstaid.model.ToothInjury
import com.example.dentalfirstaid.model.ToothTreatment
import com.example.dentalfirstaid.model.ToothType

object TraumaAppData {
    val ToothTypes = listOf(
        ToothType(
            toothType = "baby",
            toothText = R.string.baby_tooth_text,
            imageResourceId = R.drawable.baby_tooth
        ),
        ToothType(
            toothType = "adult",
            toothText = R.string.adult_tooth_text,
            imageResourceId = R.drawable.adult_tooth
        )
    )

    val ToothInjuries = listOf(
        ToothInjury(
            injuryType = "avulsion",
            injuryDescription = R.string.avulsion
        ),
        ToothInjury(
            injuryType = "intrusion",
            injuryDescription = R.string.intrusion
        ),
        ToothInjury(
            injuryType = "luxation",
            injuryDescription = R.string.luxation
        ),
        ToothInjury(
            injuryType = "fracture",
            injuryDescription = R.string.fracture
        )
    )

    val ToothTreatments: HashMap<String, HashMap<String, List<String>>> = hashMapOf(
        "baby" to hashMapOf(
            "avulsion" to listOf(
                "IMPORTANT: you may have seen recommendations elsewhere to replant teeth if they fall out. This is only true for adult teeth. Baby teeth are NOT to be replanted.",
                "Congratulations - the tooth fairy has come early!",
                "Baby teeth are meant to fall out sooner or later (with very rare exceptions!), and usually minimal treatment is required.",
                "Apply firm pressure to the gums with gauze, paper towel, or a clean cloth to stop bleeding, if there is any.",
                "Check the cheeks and gums to make sure there aren't any sharp tooth fragments are lodged into the skin.",
                "We would still recommend a consultation at the dentist to x-ray the area and make sure no fragments were pushed upwards towards the adult teeth."
            ),
            "intrusion" to listOf(
                "This is where the tooth looks shorter from being pushed into the actual socket, and can be one of the more serious injuries.",
                "Apply firm pressure with gauze to the gums to stop bleeding.",
                "See a dentist as soon as possible for an assessment - baby teeth can potentially be pushed into a developing adult tooth and cause permanent damage, and this is one of the higher risk injuries for such a scenario."
            ),
            "luxation" to listOf(
                "Apply firm pressure to the gums with gauze to stop bleeding.",
                "If heavily displaced outward, and it's not too sore, you can gently reposition the tooth with light finger pressure. If it's too sore, wait to see a dentist.",
                "If loose, gently bite down on a piece of gauze, handkerchief (or anything that's soft and clean) to stabilise the tooth.",
                "See a dentist as soon as possible for an assessment - baby teeth can potentially be pushed into a developing adult tooth and cause permanent damage."
            ),
            "fracture" to listOf(
                "Try and find the piece that's broken off - make sure there aren't any sharp pieces in the gums or cheeks!",
                "Smaller chips and breaks are not urgent, and often will not require any treatment, though we would still recommend a consultation with the dentist for an assessment",
                "Larger fractures should be booked in with a dentist as soon as possible."
            ),
        ),
        "adult" to hashMapOf(
            "avulsion" to listOf(
                "This only applies to adult teeth.  Baby teeth must not be put back in. ",
                "These instructions are for cases where the WHOLE tooth, including the root has been knocked out. For cases where only part of the tooth was knocked out, please see the broken tooth section",
                "Find the tooth and hold it  by the crown. Avoid touching the root if at all possible.",
                "Briefly rinse the tooth, preferably with milk, but you can use water if available.  Do not rinse for more than 1-2 seconds",
                "Do not try to wipe or clean the tooth root!",
                "Gently reinsert the tooth back into the socket.",
                "Stabilise and minimise movement of the tooth. You can wrap it up with aluminum foil or a similar stiff material if available, like an improvised mouthguard.",
                "Otherwise, if you have nothing on hand to stabilise the tooth, gently bitedown on something soft (cotton roll, tissue paper) and maintain firm pressure on the tooth. The goal is to minimise any kind of movement on the tooth once it's replanted.",
                "If you are not confident about replanting the tooth, keep the tooth in saline, milk, or saliva (NOT WATER), and bring it with you to the dentist. Note that this is not ideal and it would still be much better to replant the tooth at time of injury.",
                "See a dentist immediately for management."
            ),
            "intrusion" to listOf(
                "This is where the tooth looks shorter from being pushed into the actual socket.",
                "Apply firm pressure to the gums with gauze to stop bleeding.",
                "See a dentist  as soon as possible - this is one of the more serious injuries that requires immediate care."
            ),
            "luxation" to listOf(
                "Apply firm pressure with gauze to the gums to stop any bleeding.",
                "If it's been moved a large distance, and it's not too sore, you can gently reposition the tooth with light finger pressure. If it's too sore, wait to see a dentist.",
                "If the tooth is loose, try to minimise movement of the tooth, while keeping it in its original position. You can wrap it up with aluminum foil if available, like an improvised mouthguard.",
                "Otherwise, gently bitedown on something soft (cotton roll, tissue paper) and maintain firm pressure on the tooth to keep it in position and minimise movement.",
                "See a dentist as soon as possible."
            ),
            "fracture" to listOf(
                "Try and find the piece that's broken off - and make sure there aren't any sharp pieces in the gums or cheeks!",
                "Try and keep the piece, especially if it's a clean fracture. Your dentist may be able to bond the fragment back on.",
                "Keep the fragment in either milk or water to keep it moist",
                "Smaller fractures are not usually urgent, though we would still booking to see a dentist sooner rather than later",
                "Larger fractures should be booked in with a dentist as soon as possible to avoid potential dental infections."
            ),
        )
    )
}