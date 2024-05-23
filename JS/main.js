document.addEventListener('DOMContentLoaded', () => {
    const experienceTitle = document.getElementById('experience-title');
    const experienceContent = document.getElementById('experience-content');

    experienceTitle.addEventListener('click', () => {
        if (experienceContent.classList.contains('experience-hidden')) {
            experienceContent.classList.remove('experience-hidden');
            experienceContent.classList.add('experience-visible');
        } else {
            experienceContent.classList.remove('experience-visible');
            experienceContent.classList.add('experience-hidden');
        }
    });
});
