import {Route, Routes} from 'react-router-dom';
import AllMeetupsPage from './pages/AllMeetups';
import NewMeetupPage from './pages/NewMeetup';
import FavoritesPage from './pages/Favorites';
import Layout from './components/layout/Layout';

function App() {
  return (
    <Layout>
      {//localhost:3000
      }

      <Routes>
        
      <Route path='/' element={<AllMeetupsPage/>}>
      </Route>

      <Route path='/new-meetup' element={<NewMeetupPage/>}>
      </Route>

    <Route path='/favorites' element={<FavoritesPage/>}>

      </Route>
     </Routes>
     
    </Layout>);
}

export default App;
