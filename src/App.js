import React, { useState, useRef, useEffect } from 'react';
import HealthForDummies from './HealthForDummies'
import uuidv4 from 'uuid/v4';

const LOCAL_STORAGE_KEY = 'healthforDummies.symptoms'

function App() {
  const [symptoms, updateSymptoms] = useState([])
  const symptomNameRef = useRef()

  useEffect(() => {
    const storedSymptoms = JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY))
    if (storedSymptoms) updateSymptoms(storedSymptoms)
  }, [])

  useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(symptoms))
  }, [symptoms])

  function toggleSymptom(id){
    const newSymptoms = [...symptoms]
    const symptom = newSymptoms.find(symptom => symptom.id === id)
    symptom.updated = !symptom.updated
    updateSymptoms(newSymptoms)
  }

  function handleAddSymptom(e){
    const name = symptomNameRef.current.value
    if (name === '') return
    updateSymptoms(prevSymptoms => {
      return [...prevSymptoms, { id: uuidv4(), name: name, updated: false}]
    })
    symptomNameRef.current.value = null
  }

  function handleClearSymptoms(){
    const newSymptoms = symptoms.filter(symptom => !symptom.updated)
    updateSymptoms(newSymptoms)
  }

  const myDivStyle = {
    backgroundColor: 'green',
    border: '1px solid black',
    width: '1000px',
    height: '50px'
  }
    
    

  return (
  <>
    
    <div style={myDivStyle}>Health for Dummies!</div>
    <HealthForDummies symptoms = {symptoms} toggleSymptom={toggleSymptom}/>
    <input ref={symptomNameRef} type="text" />
    <button onClick={handleAddSymptom}>Add Symptoms</button>
    <button onClick={handleClearSymptoms}>Clear Symptoms</button>
    <div>Symptoms right now: {symptoms.filter(symptom => !symptom.updated).length} | The more information you give us, the better we can help you
    
    </div>
  </>
  )

}

export default App;
