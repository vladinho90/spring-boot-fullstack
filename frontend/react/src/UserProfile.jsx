const UserProfile = ({name, age, gender, profilePicture, ...props}) => {

     gender = gender === "MALE" ? "men" : "women";

    return (
        <div>
            <h1>{name}</h1>
            <p>{age}</p>
            <img src={`https://randomuser.me/api/portraits/${gender}/${profilePicture}.jpg`}/>
            {props.children}
        </div>
    )
}

export default UserProfile;