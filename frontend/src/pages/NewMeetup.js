import {useNavigate} from 'react-router-dom';
import NewMeetupForm from "../components/meetups/NewMeetupForm";

function NewMeetupPage(){

    const navigate = useNavigate();

function addMeetupHandler(meetupData){
    
    fetch('http://localhost:8080/meetups/post/',
    {
        method: 'POST',
        body: JSON.stringify(meetupData),
        headers: {
            'Content-Type': 'application/json'
        }
    }).then(() =>{
        navigate('/',{replace: true});
    });

}

    return <section>
        <h1>Add new meetup</h1>
        <NewMeetupForm onAddMeetup={addMeetupHandler}/>
    </section>;

}
export default NewMeetupPage;