import React from 'react'


export default function Symptoms({symptom, toggleSymptom}) {
    function handleSymptomClick(){
        toggleSymptom(symptom.id)
    }
    
    return (
        <div>
            <label>
                <input type="checkbox" checked={symptom.updated} onChange={handleSymptomClick}/>
                {symptom.name} 
            </label>
        </div>
    )
}
