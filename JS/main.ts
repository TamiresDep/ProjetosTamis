document.addEventListener('DOMContentLoaded', () => {
    const experienceTitle = document.getElementById('experience-title');
    const experienceContent = document.getElementById('experience-content');

    experienceTitle.addEventListener('mouseover', () => {
        experienceContent.classList.remove('experience-hidden');
        experienceContent.classList.add('experience-visible');
    });

    experienceTitle.addEventListener('mouseout', () => {
        experienceContent.classList.remove('experience-visible');
        experienceContent.classList.add('experience-hidden');
    });
});
