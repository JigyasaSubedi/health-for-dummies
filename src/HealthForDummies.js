import React from 'react'
import Symptoms from './Symptoms'

export default function HealthForDummies({symptoms, toggleSymptom }) {
    return (
        symptoms.map(symptom => {
            return <Symptoms key={symptom.id} toggleSymptom = {toggleSymptom} symptom = {symptom} />
        })
    )
}
